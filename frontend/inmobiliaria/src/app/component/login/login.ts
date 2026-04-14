import { Component } from '@angular/core';
import { MatDialogRef } from '@angular/material/dialog';

@Component({
  selector: 'app-login',
  imports: [],
  templateUrl: './login.html',
  styleUrl: './login.css',
})
export class Login {
  constructor(public dialogRef: MatDialogRef<Login>){}

  closeModal(): void{
    this.dialogRef.close();
  }
}
