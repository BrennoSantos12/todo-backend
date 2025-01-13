package todo.todolist.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // Adiciona CORS para todos os endpoints
                .allowedOrigins("http://192.168.15.5:3000", "http://192.168.15.5:3000") // Permite acesso de origens específicas (seu frontend)
                .allowedMethods("GET", "POST", "PUT", "DELETE") // Permite os métodos HTTP
                .allowedHeaders("*") // Permite qualquer cabeçalho
                .allowCredentials(true); // Permite enviar cookies e autenticação
    }
}
