import { Component } from '@angular/core';
import { CartService } from '../services/cart.service';

@Component({
  selector: 'app-payment',
  templateUrl: './payment.component.html',
  styleUrls: ['./payment.component.css']
})
export class PaymentComponent {
  paymentHandler: any = null;
  constructor(private cartService:CartService) {}
  ngOnInit() {
    this.invokeStripe();
  }
  makePayment(amount: any) {
    const paymentHandler = (<any>window).StripeCheckout.configure({
      key: 'pk_test_51MZdcsSAPXhylyRfLzkd7ZIsklFzo5Q188TBuC0GR3wUEl3JdXPtUor3R4QwPSw3abILoDNxZIBDjBVG9ODr4E5r00fuEL6naW',
      locale: 'auto',
      token: function (stripeToken: any) {
        console.log(stripeToken);
        // alert('Stripe token generated!');
        alert('Payment has been successfull!');
      },
    });
    paymentHandler.open({
      name: 'Stripe Payment',
      description: ' we make secure payments....',
      //amount: amount * 100,
    });
  }
  invokeStripe() {
    if (!window.document.getElementById('stripe-script')) {
      const script = window.document.createElement('script');
      script.id = 'stripe-script';
      script.type = 'text/javascript';
      script.src = 'https://checkout.stripe.com/checkout.js';
      script.onload = () => {
        this.paymentHandler = (<any>window).StripeCheckout.configure({
          key: 'pk_test_51MZdcsSAPXhylyRfLzkd7ZIsklFzo5Q188TBuC0GR3wUEl3JdXPtUor3R4QwPSw3abILoDNxZIBDjBVG9ODr4E5r00fuEL6naW',
          locale: 'auto',
          token: function (stripeToken: any) {
            console.log(stripeToken);
            alert('Payment has been successfull!');
          },
        });
      };
      window.document.body.appendChild(script);
    }
  }
  emptycart(){
     this.cartService.removeAllCart();
    }
;
}
