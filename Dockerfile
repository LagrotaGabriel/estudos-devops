# Comando para rodar: docker build -t medico-1.0.0 .         (OBS: O medico-.1.0.0 é o nome no target)

# Ele vai usar a JDK 17 da Oracle
FROM openjdk:17-oracle

# Ele aponta qual o caminho do jar file da aplicação. Esse jar file é copiado para dentro de imagem
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar

# Ele executa o jar da aplicação
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar","/app.jar"]