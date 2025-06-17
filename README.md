🤖 Research AI Assistant
An intelligent research tool powered by Spring Boot and Google's Gemini API

A Spring Boot-based AI web application that uses the Google Gemini API to summarize user-inputted text or suggest related research topics. It mimics the behavior of an AI chatbot like ChatGPT, with a modern UI built using Thymeleaf and Bootstrap.

✨ Key Features
AI-Powered Summarization: Instantly condense long articles, papers, or documents into concise summaries.
Topic Suggestions: Ask for related research topics based on your input to explore new avenues of study.
Dynamic Chat Interface: Interact with the AI through a clean, modern, and responsive chat-style UI.
Real-time API Communication: Seamlessly sends requests to the Gemini API and displays AI-generated output.
Robust Error Handling: Gracefully manages network or API issues to ensure a smooth user experience.
🛠️ Technology Stack
🚀 How It Works
The user submits text through the Thymeleaf and Bootstrap frontend.
The Spring Boot backend receives the request in a controller.
A service layer uses WebClient to securely call the Google Gemini API, sending the user's text and a prompt.
The Gemini API processes the request and returns the AI-generated summary or suggestion.
The backend displays the response dynamically on the UI, completing the seamless interaction.
