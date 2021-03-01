<template>
    <div class="main">
        <img alt="dragon" src="../assets/download.png">
            <div class="header">
            <h1 class="title">Dungeons and Dragons: Your Characters</h1>
        </div>

        <router-link to="player/add" tag="button" class="button is-primay">Add Your Player</router-link>
        <div class="content">
            <table>
                <thead>
                    <tr>
                        <th>Player Name</th>
                        <th>Character Name</th>
                        <th>Race</th>
                        <th>Class</th>
                        <th>Alignment</th>
                        <th>Weapon</th>
                        <th>Armor</th>
                        <th>Level / Bonus</th>
                    </tr>
                </thead>

                <tbody>
                    <tr v-for="player in players" :key="player.id">
                        <td>{{player.playerName}}</td>
                        <td>{{player.characterName}}</td>
                        <td>{{player.races.name}}</td>
                        <td>{{player.creatures.name}}</td>
                        <td>{{player.alignments.name}}</td>
                        <td>{{player.weapons.name}}</td>
                        <td>{{player.armors.name}}</td>
                        <td>{{player.level.level}}    /    {{player.level.proficiencyBonus}}</td>
                      
                        
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
        players:[],
    }),
    
    
    async mounted() {
        console.log('players mounted being')
        const{data} = await this.$http.get('http://localhost:8080/api/players');
        console.log('players mounted data', data)
        this.players = data;
    }
}
</script>

<style scope>
.button {
    margin-left: 45%;
    margin-top: 10px;
    margin-bottom: 10px;
    background-color: darkblue;
    color: white;    
}

.button:hover {
    background-color: green;
    color: white;
}

.title{
    color: darkblue;  
}
img {
    display: block;
    margin-left: auto;
    margin-right: auto;
}

.title {
    text-align: center;
}


</style>