
First Come First Serve (FCFS) Algorithm:
| Process Name | Time to process | Job Submission time | Completion Time | Turnaround Time | Waiting Time | Response Time |
|--------------|----------------|---------------------|----------------|----------------|--------------|---------------|
| p1           | 7              | 3                    | 10             | 7              | 0            | 0             |
| p5           | 19             | 7                    | 29             | 22             | 3            | 3             |
| p4           | 12             | 16                   | 41             | 25             | 13            | 13             |
| p2           | 18             | 23                   | 59             | 36             | 18            | 18             |
| p3           | 16             | 34                   | 75             | 41             | 25            | 25             |

Round Robin Algorithm:  TQ = 10 
| Process Name | Time to process | Job Submission time | Completion Time | Turnaround Time | Waiting Time | Response Time |
|--------------|----------------|---------------------|----------------|----------------|--------------|---------------|
| p1           | 7              | 3                   | 10             | 7              | 0            | 0             |
| p2           | 18             | 23                  | 69             | 46             | 28           | 28             |
| p3           | 16             | 34                  | 75             | 41             | 25           | 25            |
| p4           | 12             | 16                  | 52             | 36             | 24           | 24             |
| p5           | 19             | 7                   | 39             | 32             | 13           | 13             |

Shortest Job First Algorithm:
| Process Name | Time to process | Job Submission time | Completion Time | Turnaround Time | Waiting Time | Response Time |
|--------------|----------------|---------------------|----------------|----------------|--------------|---------------|
| p1           | 7              | 3                   | 10             | 7              | 0            | 0             |
| p2           | 18             | 23                  | 75             | 52             | 34           | 34            |
| p3           | 16             | 34                  | 57             | 23             | 7            | 7             |
| p4           | 12             | 16                  | 41             | 25             | 13           | 13            |
| p5           | 19             | 7                   | 29             | 22             | 3            | 3             |

Longest Job First Algorithm:
| Process Name | Time to process | Job Submission time | Completion Time | Turnaround Time | Wait Time | Response Time |
|--------------|----------------|---------------------|----------------|-------------------|-----------|---------------|
| p1           | 7              | 3                   | 10             | 7                 | 0         | 0             |
| p2           | 18             | 23                  | 47             | 24                | 6         | 6             |
| p3           | 16             | 34                  | 63             | 29                | 13        | 13            |
| p4           | 12             | 16                  | 75             | 59                | 47        | 47            |
| p5           | 19             | 7                   | 29             | 22                | 3         | 3             |
