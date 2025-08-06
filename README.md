# Yumey Spring Template 🌟

A modern Spring Boot template with OAuth2 authentication using the Yumey identity provider.

## 📋 Overview

This template provides a quick start for building secure Spring Boot applications with Yumey authentication integration.
It handles OAuth2 flows seamlessly and provides a solid foundation for your backend services.

## 🚀 Features

- ✅ OAuth2 authentication with Yumey identity provider
- ✅ Secure API endpoints with proper authorization
- ✅ Kotlin-based Spring Boot application
- ✅ Modern configuration with YAML
- ✅ Environment variable based configuration

## 🛠️ Setup Instructions

### Prerequisites

- JDK 17 or newer
- Gradle 7.0+ or Maven 3.8+
- Yumey developer account with client credentials

### Configuration Steps

1. **Clone the template** to your local development environment

2. **Set up environment variables**:
    - Copy `example.env` to `.env` file
    - Update the variables with your Yumey client credentials:
      ```
      YUMEY_CLIENT_ID=<YOUR_CLIENT_ID>
      YUMEY_CLIENT_SECRET=<YOUR_CLIENT_SECRET>
      YUMEY_REDIRECT_URI=http://localhost:8080/oauth2/callback/yumey
      YUMEY_ISSUER_URI=https://yumey-auth-server.vercel.app/
      ```

3. **Build the application**:
   ```bash
   ./gradlew build
   ```

4. **Run the application**:
   ```bash
   ./gradlew bootRun
   ```

5. **Access the application** at `http://localhost:8080`

## 💻 Technology Stack

- **Framework**: Spring Boot 3.x
- **Language**: Kotlin 1.8+
- **Security**: Spring Security with OAuth2 client
- **Configuration**: YAML & Environment Variables
- **Build Tool**: Gradle (Kotlin DSL)

## 🔒 Authentication Flow

1. User navigates to a protected resource
2. Application redirects to Yumey login page
3. User authenticates with Yumey
4. Yumey redirects back to application callback URL
5. Application verifies the authentication and establishes user session
6. User is redirected to the originally requested resource

## ⚠️ Important Notes

- This is a proprietary template and not available for open-source distribution
- Keep your client credentials secure and never commit them to source control
- The redirect URI must exactly match what's configured in your Yumey developer console

## 🔧 Troubleshooting

- If you encounter authentication loops, verify your client credentials and redirect URIs
- Check the Spring Boot logs for detailed error information
- Make sure your application can reach the Yumey authentication server

## 📊 Version Information

- Spring Boot: 3.2.x
- Spring Security: 6.2.x
- Kotlin: 1.8.x