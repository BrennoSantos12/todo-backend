package todo.todolist.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // Adiciona CORS para todos os endpoints
                .allowedOrigins(
                        "https://reactodolistproject.netlify.app",  // Frontend no Netlify
                        System.getenv("FRONTEND_URL") // Usando variável de ambiente (caso seja configurada no ambiente)
                )
                .allowedMethods("GET", "POST", "PUT", "DELETE") // Permite os métodos HTTP
                .allowedHeaders("*") // Permite qualquer cabeçalho
                .allowCredentials(true); // Permite enviar cookies e autenticação
    }
}
