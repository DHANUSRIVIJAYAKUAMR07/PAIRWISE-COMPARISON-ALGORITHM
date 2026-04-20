Fastest Runner Finder (Brute Force Algorithm)
📌 Problem Statement

There are n runners in a race, and one among them is faster than all others. The only way to determine who is faster is by making two runners compete against each other.

Each runner races against every other runner. The runner who wins all its comparisons is identified as the fastest runner.

🎯 Objective

To determine the fastest runner by performing pairwise comparisons among all runners and identifying the one who wins against every other runner.

🧠 Approach / Algorithm

This problem is solved using a Brute Force (Pairwise Comparison) Algorithm:

Take input for number of runners n
Store the speed of each runner in an array
Compare every runner with every other runner
Count the number of wins for each runner
The runner with (n − 1) wins is the fastest
