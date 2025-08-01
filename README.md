# Sports App - Project to show real time scores for sports games
A project designed to gain hands-on experience with Java Spring, RabbitMQ, and WebSockets by simulating real-time data processing.


## 🐇 Running RabbitMQ with Docker

```bash
docker run -d --hostname my-rabbit --name some-rabbit -p 5672:5672 -p 15672:15672 rabbitmq:3-management
```

Using Docker to run a RabbitMQ server in a containerized environment

###  🔌Breakdown of the ports:
5672 → the main port RabbitMQ uses to receive and send messages

15672 → the web dashboard port where you can monitor queues, messages, exchanges...
