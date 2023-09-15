import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { CdsNavigationModule } from '@cds/ng-web-components/navigation';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HttpClientModule } from '@angular/common/http';
import { RouterModule } from '@angular/router';

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    RouterModule,
    BrowserAnimationsModule,
    CdsNavigationModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
