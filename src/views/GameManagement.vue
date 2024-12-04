<template>
  <div>
    <h2>Manage Games</h2>
    <button @click="addGame">Add New Game</button>
    <ul>
      <li v-for="game in games" :key="game.id">
        <router-link :to="`/games/${game.id}`">{{ game.name }}</router-link>
        <button @click="deleteGame(game.id)">Delete</button>
      </li>
    </ul>
  </div>
</template>

<script>
export default {
  name: 'GameManagement',
  data() {
    return {
      games: [
        { id: 1, name: 'The Witcher 3', genre: 'RPG' },
        { id: 2, name: 'Super Mario Odyssey', genre: 'Adventure' },
        { id: 3, name: 'FIFA 21', genre: 'Sports' },
      ],
    };
  },
  methods: {
    addGame() {
      // This is where you would handle adding a game, e.g., opening a form.
      alert('Add New Game functionality');
    },
    deleteGame(id) {
      this.games = this.games.filter(game => game.id !== id);
    },
  },
};
</script>
