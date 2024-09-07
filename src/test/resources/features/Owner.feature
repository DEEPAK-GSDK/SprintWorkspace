Feature: For Owners

Background: Go to 99acres homepage
Given user is on the 99acres homepage

@Tag1
Scenario: User using area unit convertor
  
When user navigate to For Owners tab
And user click the area unit converter option under insights
And user click state details
And user click select unit for From
And user enter value for From
And user click select unit for To
Then results should be displayed
  
@Tag2
Scenario: user reading articles and posted a comment
When user navigates to the For Owners tab
And user click articles and news
And user click seller guide under articles
And user enter comment
And user enter name and email
Then Alert message should be displayed
   
@Tag3 
Scenario Outline: Check eligibility for home loans

When user navigate to the For Owners tab
And user click the Home loan tools option under the Insights
And user click check eligibility 
And user enter age as <"<YourAge>">
And user enter income as <"<NetIncome>">
And user enter existing emi as <"<ExistingEMI> ">
And user enter interest as <"<RateOfInterest>">
And user enter tenture as <"<Tenure>">
Then Estimated results should be displayed after calculating

Examples:  
  | YourAge | NetIncome | ExistingEMI | RateOfInterest | Tenure |
  | 30      | 500000    | 5000        | 7.5            | 20     |
  | 33      | 750000    | 15000       | 8.0            | 15     |
  | 35      | 600000    | 10000       | 7.0            | 17     |
  

