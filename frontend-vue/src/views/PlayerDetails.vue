<template>
    <div>
        <span>{{player.characterName}}</span>
    <ol>

    </ol>
    </div>
</template>
<script>
export default {
    data: ()=> ({
        player: {
            characterName: null
        }
    }),
    async mounted(){
        const {data} = await this.$http.get('http://localhost:8080/api/player/' + this.$route.params.id);
        this.player = data;
    }
}
</script>