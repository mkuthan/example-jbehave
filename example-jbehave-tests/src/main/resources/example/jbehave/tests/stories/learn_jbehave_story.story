Narrative:
In order to learn JBehave
As a tester
I want to define sample story for shopping cart

Lifecycle:
Before:
Given product Domain Driven Design with SKU 1234
And product Domain Driven Design price is 35 EUR

Given product Specification By Example with SKU 2345
And product Specification By Example price is 30 EUR

Scenario: Empty shopping cart

Given empty shopping cart
Then shopping cart is empty

Scenario: Products are added to empty shopping cart

Given empty shopping cart
When products are added to the shopping cart:
|PRODUCT                 |QTY|
|Domain Driven Design    |  1|
|Specification By Example|  2|

Then the number of products in shopping cart is 2
And total price is 95 EUR
