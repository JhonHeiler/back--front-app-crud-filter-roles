import { Component, OnInit } from '@angular/core';
import { Usuario } from '../../app/models/usuario';
import { MensajeService } from '../../app/servicio/mensaje.service';
import { UsuarioService } from '../../app/servicio/usuario.service';

@Component({
  selector: 'app-lista',
  templateUrl: './lista.component.html',
  styleUrls: ['./lista.component.css'],
})
export class ListaComponent implements OnInit {
  usuarios: Usuario[] = [];
  usuarioSelected!: Usuario;

  constructor(
    private usuarioService: UsuarioService,
    private mensajeService: MensajeService
  ) {}

  ngOnInit(): void {
    this.getUsuarios('');
    this.usuarioService.buscarSuscriber$.subscribe((data: any) => {
      this.usuarioSelected;
      this.getUsuarios(data);
    });
  }

  getUsuarios(nombre: string): void {
    this.usuarioService.buscar(nombre).subscribe(
      (res) => {
        this.usuarios = res;
      },
      (error) => {
        this.mensajeService.agregarMensaje({
          texto: 'Error al cargar la lista.',
          tipo: 2,
        });
      }
    );
  }

  crear(): void {
    this.mensajeService.agregarMensaje({
      texto: '',
      tipo: 0,
    });
    this.usuarioSelected = {
      id: -1,
      nombre: '',
      id_rol: -1,
      rol: { id: 0, nombre: '' },
      activo: '',
    };
  }

  seleccionar(usuarioSeleccionado: Usuario): void {
    this.usuarioSelected = usuarioSeleccionado;
  }
}
