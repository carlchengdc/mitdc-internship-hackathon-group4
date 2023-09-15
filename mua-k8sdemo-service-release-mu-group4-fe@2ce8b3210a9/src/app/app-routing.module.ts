import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [{
  path: 'sample-form',
  loadChildren: () => import('../pages/sample-form/sample-form.module').then(m => m.SampleFormModule)
}, {
  pathMatch: 'full',
  path: '',
  redirectTo: 'sample-form'
}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
