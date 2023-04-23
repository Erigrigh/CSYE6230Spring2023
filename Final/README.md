
Q1   
a.  |Need Matrix|     
    |ABCD       |  
P0  |0000       |  
P1  |0750       |  
P2  |1002       |   
P3  |0020       |  
P4  |0642       |     

b. Yes

c. Yes


Q2
const express = require('express');
const app = express();
const port = 3000;

app.get('/', (req, res) => {
  const name = req.query.name || 'Stranger';
  const message = `Hello ${name}`;
  res.send(message);
});

app.listen(port, () => {
  console.log(`Server listening at http://localhost:${port}`);
});

Q3
Video Encoding:
Video encoding is a compute-intensive task that involves compressing and converting digital video files into different formats. By using multithreading, the application can split the video encoding process into smaller sub-tasks that can be processed concurrently. For example, one thread can handle the encoding of the video frames, while another thread can handle the audio encoding. By using multiple threads, the application can achieve faster video encoding times and better overall performance.

Database Queries:
Database queries can be complex and time-consuming, especially for large databases with multiple tables and complex queries. By using multithreading, the application can split the query processing into smaller sub-tasks that can be executed concurrently. For example, one thread can handle the query execution, while another thread can handle the data retrieval. By using multiple threads, the application can achieve faster query response times and better overall performance.

Q4
1. I/O-bound tasks: If an application is primarily I/O-bound, such as reading and writing files or communicating with a network, then multithreading may not provide significant performance gains. In fact, it may even cause a decrease in performance due to the overhead of context switching between threads.

2. Synchronization-heavy tasks: If an application requires a lot of synchronization between threads, such as managing shared resources or updating a common data structure, then multithreading may not provide significant performance gains. In fact, it may even cause a decrease in performance due to the overhead of synchronization mechanisms such as locks and semaphores.


Q5. 
Short-term scheduling focuses on selecting a process to execute next, medium-term scheduling focuses on managing the degree of multiprogramming in the system, and long-term scheduling focuses on deciding which processes to admit into the system.

Q6 
The average turnaround time is 10.53.

Q7 
The code is in the Q7 file above.
