package org.example.strategy_pattern.DiscountStrategy;

/*3. Discount Calculation for Shopping Cart

Scenario:
A shopping cart system applies different discount strategies based on user type:
        •	Regular Customers get a 5% discount
	•	Premium Customers get a 10% discount
	•	Seasonal Discounts apply a 20% discount

Key Interfaces & Classes:
        •	DiscountStrategy (interface) → Defines calculateDiscount(double price).
        •	RegularDiscount, PremiumDiscount, SeasonalDiscount → Implement different discount calculations.
        •	ShoppingCart (context class) → Takes a DiscountStrategy and applies it to the total price.*/

interface DiscountStrategy {
    double price(double a);
}
