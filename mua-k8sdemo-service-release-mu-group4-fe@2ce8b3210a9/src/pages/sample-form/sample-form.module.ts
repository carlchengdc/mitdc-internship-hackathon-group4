import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CdsTextfieldModule } from '@cds/ng-web-components/textfield';
import { CdsFormFieldModule } from '@cds/ng-web-components/form-field';
import { CdsDatepickerModule } from '@cds/ng-web-components/datepicker';
import { CdsButtonModule } from '@cds/ng-web-components/button';

import { SampleFormRoutingModule } from './sample-form-routing.module';
import { SampleFormComponent } from './sample-form.component';
import { ReactiveFormsModule } from '@angular/forms';


@NgModule({
  declarations: [
    SampleFormComponent
  ],
  imports: [
    CommonModule,
    SampleFormRoutingModule,
    ReactiveFormsModule,

    CdsTextfieldModule,
    CdsFormFieldModule,
    CdsDatepickerModule,
    CdsButtonModule,
  ]
})
export class SampleFormModule { }
