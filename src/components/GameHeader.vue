<template>
  <header class="navbar">
    <div class="logo">
      <h1>Game Management System</h1>
    </div>
    <nav>
      <router-link to="/" class="nav-link">Home</router-link>
      <router-link to="/games" class="nav-link">Manage Games</router-link>
    </nav>
  </header>
</template>

<script>
export default {
  name: 'GameHeader',
};
</script>

<style scoped>
.navbar {
  background-color: red;
  padding: 15px;
  color: white;
  display: flex;
  justify-content: space-between;
  align-items: center;
}

.navbar .logo h1 {
  margin: 0;
  font-size: 24px;
}

nav {
  display: flex;
}

.nav-link {
  color: white;
  text-decoration: none;
  margin-left: 20px;
}

.nav-link:hover {
  text-decoration: underline;
}
</style>
