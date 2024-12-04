import { createStore } from 'vuex';

export default createStore({
    state: {
        games: [
            { id: 1, name: 'Game 1', genre: 'Action', releaseDate: '2021-01-01' },
            { id: 2, name: 'Game 2', genre: 'Adventure', releaseDate: '2021-02-15' },
        ],
    },
    mutations: {
        addGame(state, game) {
            state.games.push(game);
        },
        deleteGame(state, gameId) {
            state.games = state.games.filter(game => game.id !== gameId);
        },
        updateGame(state, updatedGame) {
            const index = state.games.findIndex(game => game.id === updatedGame.id);
            if (index !== -1) {
                state.games[index] = updatedGame;
            }
        },
    },
    actions: {
        addGame({ commit }, game) {
            commit('addGame', game);
        },
        deleteGame({ commit }, gameId) {
            commit('deleteGame', gameId);
        },
        updateGame({ commit }, updatedGame) {
            commit('updateGame', updatedGame);
        },
    },
    getters: {
        allGames: (state) => state.games,
        getGameById: (state) => (id) => state.games.find(game => game.id === id),
    },
});
