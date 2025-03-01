import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PseudocodeComponent } from './pseudocode.component';

describe('PseudocodeComponent', () => {
  let component: PseudocodeComponent;
  let fixture: ComponentFixture<PseudocodeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [PseudocodeComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PseudocodeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
