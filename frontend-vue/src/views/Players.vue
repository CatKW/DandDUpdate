<template>
    <div class="main">
        <div class="header">
            <h1 class="title">Dungeons and Dragons: Your Characters</h1>
        </div>

        <router-link to="player/add" tag="button" class="button is-primay">Add Your Player</router-link>
        <div class="content">
            <table>
                <thead>
                    <tr>
                        <th>#</th>
                        <th>Player Name</th>
                        <th>Character Name</th>
                        <th>Race</th>
                        <th>Class</th>
                        <th>Alignment</th>
                        <th>Weapon</th>
                        <th>Armor</th>
                    </tr>
                </thead>

                <tbody>
                    <tr v-for="player in players" :key="player.id">
                        <td>{{player.id}}</td>
                        <td>{{player.playerName}}</td>
                        <td>{{player.characterName}}</td>
                        <td>{{player.races.name}}</td>
                        <td>{{player.creatures.name}}</td>
                        <td>{{player.alignments.name}}</td>
                        <td>{{player.weapons.name}}</td>
                        <td>{{player.armors.name}}</td>
                      
                        
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

    
    async mounted() {
        console.log('players mounted being')
        const{data} = await this.$http.get('http://localhost:8080/api/players');
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