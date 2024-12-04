import { createRouter, createWebHistory } from 'vue-router';
import Home from '../views/GameHome.vue';
import GameManagement from '../views/GameManagement.vue';
import GameDetail from '../views/GameDetail.vue';

const routes = [
    { path: '/', name: 'Home', component: Home },
    { path: '/games', name: 'GameManagement', component: GameManagement },
    { path: '/games/:id', name: 'GameDetail', component: GameDetail, props: true },
];

const router = createRouter({
    history: createWebHistory(),
    routes,
});

export default router;
