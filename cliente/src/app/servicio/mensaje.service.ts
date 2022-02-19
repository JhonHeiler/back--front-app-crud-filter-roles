import { Injectable } from '@angular/core';
import { Mensaje } from '../../app/models/mensaje';
import { Observable, Subscriber } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class MensajeService {
  mensaje: Mensaje | undefined;

  constructor() {}

  agregarMensaje(mensaje: Mensaje) {
    this.mensaje = mensaje;
  }
}
