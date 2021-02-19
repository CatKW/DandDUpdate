<template>
    <div class="main">
        <div class="header">
            <h1 class="title">Dungeons and Dragons: Your Characters</h1>
        </div>

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
                        <td>{{player.firstName}} {{player.lastName}}</td>
                        <td>{{player.characterName}}</td>
                    </tr>
                </tbody>
            </table>
        </div>
    </div>
</template>

<script>
export default {
    data:() => ({
        players:[]
    }),
    async mounted() {
        console.log('players mounted being')
        const{data} = await this.$http.get('http://localhost:8080/api/player');
        console.log('players mounted data', data)
        this.players = data;
    }
}
</script>
