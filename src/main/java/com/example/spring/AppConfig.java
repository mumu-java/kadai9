package com.example.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

@Configuration
public class AppConfig {

    @Bean
    public SshPrivateKey sshPrivateKey() throws Exception {
        Resource resource = new FileSystemResource("SSHキーまでのパス(ファイル名含む)");
        return new SshPrivateKey(resource.getInputStream());
    }
}
