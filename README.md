# dayGuesser

This project utilizes the fundamentals of Java. You can input a date, and it will tell you what day of the week it was on that date.

Zeller's Congruence

Zeller's Congruence is a formula to find the day of the week for any date.

Formula -
  h = (day + (13 * (m + 1) / 5) + k + (k / 4) + (j / 4) - 2 * j) % 7.
  
Where:
-  
h
  = day of the week (0 = Saturday, 1 = Sunday, 2 = Monday, ..., 6 = Friday)
-  
q
  = day of the month
-  
m
  = month (3 = March, 4 = April, ..., 12 = December; January and February are 13 and 14 of the previous year)
-  
K
  = year of the century (year % 100)
-  
J
  = zero-based century (year / 100)
-


  

