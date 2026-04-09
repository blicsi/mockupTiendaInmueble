import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { Listing } from './component/listing/listing';
import { Menu } from './component/menu/menu';
import { Footer } from './component/footer/footer';
import { Busqueda } from './component/busqueda/busqueda';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet,Listing,Menu,Footer,Busqueda],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title ='Inmobiliaria';
  protected readonly descripcion = "Inmoviliaria de blur y blicsi";
  protected readonly autores= "Blur/Blicsi"
}
