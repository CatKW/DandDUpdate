<template>
    <div class="main">
        <div class="header">
            <h1 class="title">Dungeons and Dragons: Classes</h1>
        </div>
        <div class="content">
            <table id="playerclass" class="table">
                <thead>
                    <tr>
                        <th>#</th>
                        <th>Name</th>
                        <th>Description</th>
                        <th>Click to Watch Video</th>
                    </tr>
                </thead>
                <tbody>
                    <tr v-for="playerclass in playerclasses" :key="playerclass.id">
                        <td>{{playerclass.id}}</td>
                        <td>{{playerclass.playerclassName}}</td>
                        <td>{{playerclass.playerclassDesc}}</td>
                        <td>{{playerclass.playerclassUrl}}</td>
                    </tr>
                </tbody>
            </table>
        </div>
    </div>
</template>

<script>
export default {
    name: "Playerclass",
    data: () => ({
        playerclasses:[]
    }),
    async mounted() {
        console.log('playerclasses being mounted')
        const{data} = await this.$http.get('http://localhost:8080/api/playerclass');
        console.log('playerclass mounted data', data)
        this.playerclasses = data;
    }
}
</script>