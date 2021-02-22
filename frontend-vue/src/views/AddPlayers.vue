<template>
    <div>
        <h1 class="title"> Add Player </h1>

        <div class="field">
            <label class="label" for="playerName">Player Name</label>
            <div class="controller">
                <input id="playerName" class="input" type="text" v-model="player.playerName" placeholder="Player Name"/>
            </div>
        </div>

        <div class="field">
            <label class="label" for="characterName">Character Name</label>
            <div class="controller">
                <input id="characterName" class="input" type="text" v-model="player.characterName" placeholder="Character Name"/>
            </div>
        </div>
        <div class="field is-grouped">
        <div class="control">
            <button @click="cancel" class="button">Cancel</button>
        </div>
        <div class="control">
            <button @click="save" class="button is-primary">Save</button>
        </div>
    </div>
    </div>
</template>

<script>
export default {
    name: "AddPlayers",
    data:() => ({
        player: {
            playerName: "",
            characterName: ""
        }
   }),
    methods: {
        async save() {
            console.log('AddPlayers.save() player=', this.player)
            const response = await this.$http.post('http://localhost:8080/api/player/', this.player);
            console.log('AddPlayers.save() response=', response);
            this.$router.push({path: '/players'});
        },
        cancel () {
            this.$router.push({path: '/players'})
        }, 
        
    }
}
</script>