<template>
    <div class="main">
        <div class="header">
            <h1 class="title">Dungeons and Dragons: Your Characters</h1>
        </div>

        <router-link to="players/add" tag="button" class="button is-primary"> Add Player</router-link>

        <div class="content">
            <table>
                <thead>
                    <tr>
                        <th>#</th>
                        <th>Player Name</th>
                        <th>Character Name</th>
                    </tr>
                </thead>

                <tbody>
                    <tr v-for="player in players" :key="player.id">
                        <td>{{player.id}}</td>
                        <td>{{player.playerName}}</td>
                        <td><a @click="playerDetails(player.id)">{{player.characterName}}</a></td>
                    </tr>
                </tbody>
            </table>
        </div>
    </div>
</template>

<script>
export default {
    name: "Players",
    data: () => ({
        players:[]
    }),

    methods: {
        playerDetails(playerId) {
            this.$router.push('player/' + playerId);
        }
    },
    async mounted() {
        console.log('players mounted being')
        const{data} = await this.$http.get('http://localhost:8080/api/player');
        console.log('players mounted data', data)
        this.players = data;
    }
}
</script>

<style scoped>
button{
  float: right;
}
</style>