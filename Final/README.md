
Q1   
a.  |Need Matrix|     
    |ABCD       |  
P0  |0000       |  
P1  |0750       |  
P2  |1002       |   
P3  |0020       |  
P4  |0642       |     

b. Yes


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
Tasks that require frequent context switching:  
When multiple threads are running on a single processor, the processor needs to switch between threads frequently to allow each thread to make progress. This process is known as context switching and can be time-consuming. If a program has many threads that require frequent context switching, the overhead of context switching may actually slow down the program and reduce its overall performance. In such cases, a single-threaded program may perform better since it does not require context switching.

Tasks with limited hardware resources:   
The program's performance will be limited by the hardware resources available, such as the number of CPU cores or memory. If a program is designed to use more threads than there are available CPU cores, the operating system will need to perform time-sharing, which means each thread will have less CPU time and may not be able to make much progress. In such cases, a single-threaded program that uses the available hardware resources efficiently may perform better than a multithreaded program that cannot use the hardware effectively.

Q5   
Short-term scheduling focuses on selecting a process to execute next, allows user to select processes from the loads and pool back into the memory, offers full control.  
Medium-term scheduling focuses on managing the degree of multiprogramming in the system, It only selects processes that is in a ready state of the execution, offers less control.  
Long-term scheduling focuses on deciding which processes to admit into the system, it helps to send the process back to the memory, reduces the level of multiprogramming.  

Q6 
The average turnaround time is 10.53.

Q7 
The code is in the Q7 file above.
