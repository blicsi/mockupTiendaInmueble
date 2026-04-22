import { Component,ChangeDetectionStrategy } from '@angular/core';
import { MatDialogRef } from '@angular/material/dialog';
import { MatButton } from '@angular/material/button';
import { MatFabButton } from '@angular/material/button';
import {MatInputModule} from '@angular/material/input';

@Component({
  selector: 'app-login',
  imports: [MatButton, MatFabButton, MatInputModule],
  templateUrl: './login.html',
  styleUrl: './login.css',
})
export class Login {
  constructor(public dialogRef: MatDialogRef<Login>){}

  closeModal(): void{
    this.dialogRef.close();
  }
}

