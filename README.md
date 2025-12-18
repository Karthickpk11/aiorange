### 🧠 aiorange
**Spring AI** is an **application framework for AI engineering** built on top of the popular **Spring ecosystem** (a widely-used Java framework), designed to make it easier for developers to integrate **artificial intelligence (especially API-based models like LLMs)** into their applications in a familiar, modular, and scalable way.

Spring AI provides abstractions and tools that simplify connecting your application with AI models from various providers (e.g., OpenAI, Anthropic, Google, Amazon, local LLMs like Ollama) and handling AI interactions like **chat, embeddings, text-to-image, transcription, RAG (Retrieval-Augmented Generation)**, and more — all using Spring-style configuration and programming patterns. 

Test Result:
![image](https://github.com/user-attachments/assets/872de5e0-f54a-4f6b-a39d-32e248fed581)


Read more: https://spring.io/projects/spring-ai#overview

**Spring AI**

**Focus**: Seamless integration of AI functionalities into Spring Boot apps.  
**Real-Time/Enterprise Fit**: Especially suitable if you already use Spring extensively.  
**Integration Strategy:**  
Configure LLM clients, data pipelines, or HPC clusters within the Spring context.  
Expose AI endpoints (REST, WebSocket) protected by Spring Security.  

### 🚀 Spring AI Key Features

**1. Multi-Provider Model Support**
Spring AI supports major AI model providers with a portable API so you can switch between backends just by changing configuration.

**2. ChatClient API**
A core API that makes calling chat and other model endpoints easy with fluent, Spring-style code.

**3. Prompt Templates & Structured I/O**
Use template systems and map model outputs directly into Java POJOs (plain Java objects).

**4. RAG and Vector Store Integration**
Generate embeddings and plug into vector databases (like Redis, PostgreSQL with pgvector, Milvus, etc.) for document search and retrieval.

**5. Chat Memory & Function/Tool Calling**
Support for conversational memory (keeping context) and “tool calls” (invoking your own APIs and processes from prompts).

**6. Observability & Metrics**
Integration with observability tools (e.g., Micrometer) for tracking performance, latency, and token usage.

### 🧩 How It Works

* Build a Spring Boot application as usual.
* Configure Spring AI via `application.yaml`/properties to register AI providers and options.
* Use Spring AI APIs like `ChatClient` to construct and send prompts — Spring handles talking to models and returning structured data.

Effectively, Spring AI **brings AI model interaction into the Spring ecosystem with consistent APIs and enterprise-grade patterns**.
