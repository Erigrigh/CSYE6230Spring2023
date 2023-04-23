Q1. 
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
Image Processing:
when we have a program that processes a large number of images. The image processing task can be broken down into multiple sub-tasks such as reading, resizing, filtering, and saving. If you process images sequentially, it can take a long time to complete the task. However, by using multithreading, you can divide the work into multiple threads and run them simultaneously, which can significantly reduce the processing time. For example, while one thread reads an image from the disk, another thread can resize an image, and a third thread can apply a filter to an image.

Web Crawler:
when we are building a web crawler that needs to fetch data from multiple websites. Fetching data from a website can take a long time because of network latency, and the crawler has to wait for the response before moving on to the next website. However, by using multithreading, you can fetch data from multiple websites simultaneously, which can significantly reduce the time it takes to complete the task. For example, you can create multiple threads, each responsible for fetching data from a different website, and run them concurrently. This way, if one thread is waiting for a response, other threads can continue working, thus maximizing the utilization of system resources.

Q4
1. I/O-bound tasks: If an application is primarily I/O-bound, such as reading and writing files or communicating with a network, then multithreading may not provide significant performance gains. In fact, it may even cause a decrease in performance due to the overhead of context switching between threads.

2. Synchronization-heavy tasks: If an application requires a lot of synchronization between threads, such as managing shared resources or updating a common data structure, then multithreading may not provide significant performance gains. In fact, it may even cause a decrease in performance due to the overhead of synchronization mechanisms such as locks and semaphores.


Q5. 
Short-term scheduling focuses on selecting a process to execute next, medium-term scheduling focuses on managing the degree of multiprogramming in the system, and long-term scheduling focuses on deciding which processes to admit into the system.

Q6 
The average turnaround time is 10.53
