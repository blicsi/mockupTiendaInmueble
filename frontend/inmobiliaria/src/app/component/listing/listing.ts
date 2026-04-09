import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-listing',
  imports: [FormsModule],
  templateUrl: './listing.html',
  styleUrl: './listing.css',
})
export class Listing {
  listados: string[]=[];
  nuevoListado: string="";

  addListado(){
    if(this.nuevoListado && this.nuevoListado.trim()){
      this.listados.push(this.nuevoListado.trim());
      this.nuevoListado="";
    }
  }
}
