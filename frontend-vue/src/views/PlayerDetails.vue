<template>
    <div>
        <span>{{player.characterName}}</span>
        <ul>
            <li>{{player.armors.name}}</li>
            <li>{{player.alignment.name}}</li>
            <li>{{player.playerclass.playerclassName}}</li>
        
            <li>{{player.races.name}}</li>
            <li>{{player.weapons.name}}</li>
        
        </ul>
    </div>
</template>
<script>
export default {
    data: ()=> ({
        player: [],
    }),
    async mounted(){
        const {data} = await this.$http.get('http://localhost:8080/api/player/' + this.$route.params.id);
        this.player = data;
    }
}
</script>