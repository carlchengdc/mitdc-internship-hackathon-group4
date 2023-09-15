import { Injectable } from '@angular/core';
import { Person } from '../models/person.interface';

@Injectable({
  providedIn: 'root'
})
export class UserService {
  person: Person = {};

  constructor() { }
}
