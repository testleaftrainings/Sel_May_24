Feature: Create lead for multiple data

#Background --common Scenario
#Background:
#Given Launch the Browser and Load the URL


Scenario Outline: CreateLead 
When Enter the Username as 'DemoSalesManager'
And Enter the Password as 'crmsfa'
And Click on LoginButton
Then Verify its in Homepage
When Click on Crmsfa button
And Click on Leads button
And Click on CreateLead button
And Enter the CompanyName as <companyName>
And Enter the FirstName as <firstName>
And Enter the LastName as <lastName>
And Click on Sumbit Button
Then Verify the CreateLeadPage

Examples:
|companyName|firstName|lastName|
|'TestLeaf'|'Dilip'|'Kumar'|
|'TestLeaf'|'Aravind'|'R'|