import { Component } from '@angular/core';
import { MatDialog } from '@angular/material/dialog';
import { Login } from '../login/login';

@Component({
  selector: 'app-menu',
  imports: [],
  templateUrl: './menu.html',
  styleUrl: './menu.css',
})
export class Menu {

  constructor(public dialog: MatDialog){}

  openModal(): void{
    this.dialog.open(Login);
  }

}
