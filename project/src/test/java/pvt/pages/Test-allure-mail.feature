Feature: Test allure Mail

Scenario: negative login test case
    Given I am on page with "https://mail.ru/" url
    When enter login ("anastasiyakibisova") and enter password ("12345")
	When Press the button
	Then I see error