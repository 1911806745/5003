<template>
  <div>
    <h2>{{ game.name }} - Details</h2>
    <p><strong>Genre:</strong> {{ game.genre }}</p>
    <p><strong>Release Date:</strong> 2021-12-01</p>
    <router-link to="/games">Back to Games List</router-link>
  </div>
</template>

<script>
export default {
  name: 'GameDetail',
  props: ['id'],
  data() {
    const gameId = parseInt(this.id);
    const games = [
      { id: 1, name: 'The Witcher 3', genre: 'RPG' },
      { id: 2, name: 'Super Mario Odyssey', genre: 'Adventure' },
      { id: 3, name: 'FIFA 21', genre: 'Sports' },
    ];
    return {
      game: games.find(game => game.id === gameId),
    };
  },
};
</script>
