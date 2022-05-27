import {Tabs, Tab} from '@material-ui/core'
import AccountCircleSharpIcon from '@material-ui/icons/AccountCircleSharp'
import { useCallback, useState } from 'react'
import { Navigate, useNavigate } from 'react-router-dom'
import { useGlobal } from '../../Contexts/Global/Global'
import { AuthenticatedUser } from '../../types'
import { SignModalEnum } from '../../types'

import './Menu.css'

type MenuProps = {
    style?: any;
}

export const Menu = ({
    style
}: MenuProps) => {
    const [pageSelected, setTableSected] = useState(0)
    const { authenticatedUser, setAuthenticatedUser, setShowSignModal } = useGlobal()
    const navigate = useNavigate();

    const handleChange = useCallback((e: React.ChangeEvent<{}>, newValue: number) => {
        setTableSected(newValue)
    },[])

    return(
        <div className="menu-container" style={style}>
            <Tabs value={pageSelected} onChange={handleChange}>
                <Tab label="Lançamentos" onClick={() => navigate('/releases')}/>
                <Tab label="Favoritos" onClick={() => navigate('/favorites')}/>
                <Tab label="Carrinho" onClick={() => navigate('/shopping-cart')}/>
                <Tab label={
                    <div 
                        className='login-tab' 
                        onClick={() => authenticatedUser ? 
                            setShowSignModal(SignModalEnum.SIGN_IN) : 
                            setAuthenticatedUser({} as AuthenticatedUser)
                        }
                    >
                        <AccountCircleSharpIcon/>
                        <span >{authenticatedUser ? "Entrar" : "Sair"}</span>
                    </div>
                }/>
            </Tabs>
        </div>
    )
}