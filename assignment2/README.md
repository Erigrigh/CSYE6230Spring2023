
First Come First Serve (FCFS) Algorithm:
| Process Name | Time to process | Job Submission time | Completion Time | Turnaround Time | Waiting Time | Response Time |
|--------------|----------------|---------------------|----------------|----------------|--------------|---------------|
| p1           | 7              | 3                   | 10             | 7              | 0            | 0             |
| p2           | 18             | 23                  | 41             | 18             | 0            | 0             |
| p3           | 16             | 34                  | 50             | 16             | 0            | 0             |
| p4           | 12             | 16                  | 28             | 12             | 0            | 0             |
| p5           | 19             | 7                   | 29             | 22             | 5            | 0             |

Round Robin Algorithm
| Process Name | Time to process | Job Submission time | Completion Time | Turnaround Time | Waiting Time | Response Time |
|--------------|----------------|---------------------|----------------|----------------|--------------|---------------|
| p1           | 7              | 3                   | 22             | 19             | 12           | 0             |
| p2           | 18             | 23                  | 47             | 24             | 6            | 0             |
| p3           | 16             | 34                  | 50             | 16             | 0            | 14            |
| p4           | 12             | 16                  | 37             | 21             | 5            | 0             |
| p5           | 19             | 7                   | 51             | 44             | 25           | 0             |

Shortest Job First Algorithm:
| Process Name | Time to process | Job Submission time | Completion Time | Turnaround Time | Waiting Time | Response Time |
|--------------|----------------|---------------------|----------------|----------------|--------------|---------------|
| p1           | 7              | 3                   | 10             | 7              | 0            | 0             |
| p4           | 12             | 16                  | 28             | 12             | 0            | 0             |
| p3           | 16             | 34                  | 50             | 16             | 0            | 0             |
| p2           | 18             | 23                  | 68             | 45             | 27           | 0             |
| p5           | 19             | 7                   | 87             | 80             | 61           | 0             |

Longest Job First Algorithm:
| Process Name | Time to process | Job Submission time | Completion Time | Turnaround Time | Wait Time | Response Time |
|--------------|----------------|---------------------|----------------|----------------|-----------|---------------|
| p5           | 19             | 7                   | 26             | 19             | 0         | 0             |
| p2           | 18             | 23                  | 44             | 21             | 3         | 0             |
| p3           | 16             | 34                  | 60             | 26             | 10        | 0             |
| p4           | 12             | 16                  | 72             | 56             | 44        | 0             |
| p1           | 7              | 3                   | 79             | 76             | 69        | 0             |
