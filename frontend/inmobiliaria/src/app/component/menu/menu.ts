import { Component } from '@angular/core';
import { MatButton, MatFabButton} from '@angular/material/button';
import { MatIcon } from '@angular/material/icon';
import { MatDialog } from '@angular/material/dialog';
import { Login } from '../login/login';

@Component({
  selector: 'app-menu',
  imports: [MatButton, MatFabButton,MatIcon],
  templateUrl: './menu.html',
  styleUrl: './menu.css',
})
export class Menu {

  constructor(public dialog: MatDialog){}

  openModal(): void{
    this.dialog.open(Login);
  }

}
