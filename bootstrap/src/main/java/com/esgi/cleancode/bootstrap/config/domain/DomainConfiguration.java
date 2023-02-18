package com.esgi.cleancode.bootstrap.config.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.esgi.cleancode.domain.functional.service.BattleExecutorService;
import com.esgi.cleancode.domain.functional.service.BattleViewerService;
import com.esgi.cleancode.domain.functional.service.DeckAppenderService;
import com.esgi.cleancode.domain.functional.service.DeckInspectorService;
import com.esgi.cleancode.domain.functional.service.HeroCreatorService;
import com.esgi.cleancode.domain.functional.service.HeroFinderService;
import com.esgi.cleancode.domain.functional.service.PackOpenerService;
import com.esgi.cleancode.domain.functional.service.PlayerCreatorService;
import com.esgi.cleancode.domain.functional.service.PlayerFinderService;
import com.esgi.cleancode.domain.ports.client.BattleExecutorApi;
import com.esgi.cleancode.domain.ports.client.BattleViewerApi;
import com.esgi.cleancode.domain.ports.client.DeckAppenderApi;
import com.esgi.cleancode.domain.ports.client.DeckInspectorApi;
import com.esgi.cleancode.domain.ports.client.HeroCreatorApi;
import com.esgi.cleancode.domain.ports.client.HeroFinderApi;
import com.esgi.cleancode.domain.ports.client.PackOpenerApi;
import com.esgi.cleancode.domain.ports.client.PlayerCreatorApi;
import com.esgi.cleancode.domain.ports.client.PlayerFinderApi;
import com.esgi.cleancode.domain.ports.server.BattlePersistenceSpi;
import com.esgi.cleancode.domain.ports.server.DeckPersistenceSpi;
import com.esgi.cleancode.domain.ports.server.HeroPersistenceSpi;
import com.esgi.cleancode.domain.ports.server.PlayerPersistenceSpi;

@Configuration
public class DomainConfiguration {

    // API CONTROLERS

    @Bean
    public BattleExecutorApi battleExecutorApi(BattlePersistenceSpi spi) {
        return new BattleExecutorService(spi);
    }

    @Bean
    public BattleViewerApi battleViewerApi(BattlePersistenceSpi spi) {
        return new BattleViewerService(spi);
    }

    @Bean
    public DeckAppenderApi deckAppenderApi(DeckPersistenceSpi spi) {
        return new DeckAppenderService(spi);
    }

    @Bean
    public DeckInspectorApi deckInspectorApi(DeckPersistenceSpi spi) {
        return new DeckInspectorService(spi);
    }

    @Bean
    public HeroCreatorApi heroCreatorApi(HeroPersistenceSpi spi) {
        return new HeroCreatorService(spi);
    }

    @Bean
    public HeroFinderApi heroFinderApi(HeroPersistenceSpi spi) {
        return new HeroFinderService(spi);
    }

    @Bean
    public PackOpenerApi packOpenerApi() {
        return new PackOpenerService();
    }

    @Bean
    public PlayerCreatorApi playerCreatorApi(PlayerPersistenceSpi spi) {
        return new PlayerCreatorService(spi);
    }

    @Bean
    public PlayerFinderApi playerFinderApi(PlayerPersistenceSpi spi) {
        return new PlayerFinderService(spi);
    }
}
