package com.Bank;




	class CurrentAccount extends Bank{
		float cash;
		float credit;
		public CurrentAccount(float c, float cr) {
			cash=c;
			credit= cr;
		}
		public float amount() {
			float cashcredit=cash+credit;
			return cashcredit;
		}

	}



