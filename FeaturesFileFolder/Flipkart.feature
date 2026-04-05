Feature:
@multipleData

Scenario:    Verify the functionality of search module in flipkart homepage

Given launch an chrome browser
And Navigate to flipkart site 
When Enter "mobile" in search module in homepage
And validate mobile page has been open by pagetitle and the title is "Mobile- Buy Products Online at Best Price in India - All Categories | Flipkart.com"
Then close an chrome browser

Given launch an chrome browser
And Navigate to flipkart site 
When Enter "laptop" in search module in homepage
And validate mobile page has been open by pagetitle and the title is "Laptop- Buy Products Online at Best Price in India - All Categories | Flipkart.com"
Then close an chrome browser

@singleData @regression

Scenario:verify the functinality of product

Given launch an chrome browser
And Navigate to flipkart site 
And search an "mobile" in search module at homepage.
When Click on a first product
Then close an chrome browser


