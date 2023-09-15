import { Component } from '@angular/core';
import { FormBuilder, FormControl, FormGroup } from '@angular/forms';
import { Age } from 'src/models/age.interface';
// import { UserService } from 'src/services/user.service';


@Component({
  selector: 'app-sample-form',
  templateUrl: './sample-form.component.html',
  styleUrls: ['./sample-form.component.scss']
})
export class SampleFormComponent {
  personForm: FormGroup;
  dobControl = new FormControl();
  maxDate = new Date();
  age: Age | null  = null;

  constructor(
    private fb: FormBuilder,
    // private userService: UserService,
  ) {
    this.personForm = this.fb.group({
      firstName: new FormControl<string>(''),
      lastName: new FormControl<string>('')
    })

    this.maxDate.setFullYear(this.maxDate.getFullYear() - 18)
  }

  calculateAge() {
    const dob = this.dobControl.value;

    if (!dob) {
      return;
    }

    const dobDate = new Date(dob);
    const now = new Date();
    this.age = {
      years: now.getFullYear() - dobDate.getFullYear(),
    }
  }

  // setPerson() {
  //   const person = this.personForm.value;

  //   this.userService.person.firstName = person.firstName;
  //   this.userService.person.lastName = person.lastName;
  //   this.userService.person.age = { ...this.age };
  // }
}
