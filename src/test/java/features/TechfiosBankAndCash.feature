 @AddContactFeature @Test2 
 Feature:Techfios Techfios Bank & Cash Functionality Validality
 
 @Scenario3 @Smoke 
 Scenario: 
 Given User is on techfios login page
 When User enters username as "demo@techfios.com" 
 When User enters password as "abc123" 
 When User clicks on signin button 
 When User should land on dashboard page
 When User clicks on BankCash button
 When User clicks on NewAccount button
 When User should land on Accounts page 
 When User enters Account Title as"Business"  
 When User enters Description as "Checking"  
 When User enters Initial Balance as"25000.00"  
 When User enters Account Number as"000111222"   
 When User enters Contact as "Mark Doe"   
 When User enters Phone as "817252"   
 When User enters Internet Banking URL as"bankurl"  
 When User clicks on submit button 
 Then User should be able to validate account created successfully
  
   
 