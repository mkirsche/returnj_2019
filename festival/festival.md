Problem statement:

James is spedning the day at a film festival. He is only there for a day he wants to make sure that he can watch as many movies and shorts as he possibly can.
While James wants to be watching something at every moment he is not very specific about what he wants to watch. He just prefers to be watching something.
Help James find out how much time he would not being watching anything during the day.


## Input:

The first line is the number of movie showings $\ n < 100$

The second line is the start and end times of the day $\ 0 \leq s < e \leq 1000$

The next $\ n$ lines are the give the start and end times of film screenings of the form $\ s \leq s_i \leq e_i \leq e$ where $s_i, e_i$ represent the starting and ending times of the $i^\text{th}$ screening. So show $i$ starts before time $s_i$ and ends after $e_i$. Giving it a length of $e_i - s_i + 1$.

## Output
Print one integer $k$, where $k$ is the amount of time in the day when James is not watching some screening.



