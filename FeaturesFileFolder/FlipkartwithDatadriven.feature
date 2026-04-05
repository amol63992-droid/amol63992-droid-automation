Feature:

@DataDriven @multipleValues @search


Scenario Outline:
Given launch an chrome browser
And Navigate to flipkart site
When search <search> in search text box
And Click on a first product
And Click on add to card
And click on cart logo
And Check <ProductExp> product name has been added
Then close an chrome browser
Examples:
|search|ProductExp|
|"iphone 17 pro 512GB" | "Apple iPhone 17 Pro" |
|"HP 14 AI PC"|"HP 14 AI PC"|
|"Carrier"|"CARRIER 2026"|
