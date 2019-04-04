## Problem statement:

James is spending the day at a film festival.  Since he is only there for a day, he wants to make sure that he can watch movies and shorts as much as he possibly can.

While James wants to be watching something at every moment, he is not very specific about what he wants to watch.  He just prefers to maximize the total time he spends watching movies or films.

He is given a schedule which specifies the start and end time of each film, and would like to plan which screenings he views.  The festival has strict rules which forbid him from entering a screening after it has begun or leaving a screening before it has ended, so he has asked you to help him choose which screenings to view to maximize his total viewing time.

Help James find out how much time he would not being watching anything during the day.


## Input:

The first line is the number of movie showings $\ n < 100$

The second line is the start and end times of the day $\ 0 \leq s < e \leq 1000$

The next $\ n$ lines give the start and end times of film screenings of the form $\ s \leq s_i \leq e_i \leq e$ where $s_i, e_i$ represent the starting and ending times of the $i^\text{th}$ screening.  If James views a show starting at time s_i and ending at time e_i, then the previous end show must end no later than time (s_i - 1) and the following show must start no earlier than time (e_i + 1).  Assume the time required to move between viewing areas is negligible.

## Output
Print one integer $k$, where $k$ is the maximum total amount of time during the day when James is viewing a screening.



